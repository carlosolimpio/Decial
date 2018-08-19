# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table avaliacao (
  id                            bigint auto_increment not null,
  avaliacao                     varchar(400),
  nota                          double not null,
  usuario_id                    bigint not null,
  etr                           integer not null,
  data                          date not null,
  constraint ck_avaliacao_etr check (etr in (0,1,2)),
  constraint pk_avaliacao primary key (id)
);

create table cardapio (
  id                            bigint not null,
  principal                     varchar(255),
  acompanhamento                varchar(255),
  grelha                        varchar(255),
  sobremesa                     varchar(255),
  suco                          varchar(255),
  salada                        varchar(255),
  fastgrill                     varchar(255),
  vegetariano                   varchar(255),
  sopa                          varchar(255),
  constraint pk_cardapio primary key (id)
);
create sequence cardapio_seq;

create table cardapio_dia (
  data                          varchar(255)
);

create table cartao (
  numero                        integer not null,
  nome                          varchar(25),
  agencia                       varchar(15) not null,
  conta                         varchar(15) not null,
  mes_expiracao                 integer,
  ano_expiracao                 integer,
  banco_emissor                 varchar(30),
  bandeira                      varchar(30) not null,
  hash                          varchar(400),
  usuario_id                    bigint,
  constraint uq_cartao_usuario_id unique (usuario_id),
  constraint pk_cartao primary key (numero)
);
create sequence cartao_seq;

create table entrada_ru (
  id                            bigint not null,
  usuario_id                    bigint not null,
  is_dinheiro                   boolean not null,
  etr                           integer not null,
  data                          date not null,
  hora                          time not null,
  constraint ck_entrada_ru_etr check (etr in (0,1,2)),
  constraint pk_entrada_ru primary key (id)
);
create sequence entrada_ru_seq;

create table forma_pagamento (
  id                            integer not null,
  forma_pagamento               varchar(20) not null,
  descricao                     varchar(255),
  constraint pk_forma_pagamento primary key (id)
);
create sequence forma_pagamento_seq;

create table opcao_refeicao (
  id                            integer not null,
  opcao_refeicao                varchar(15) not null,
  descricao                     varchar(255),
  constraint pk_opcao_refeicao primary key (id)
);
create sequence opcao_refeicao_seq;

create table reserva (
  id                            bigint not null,
  usuario_id                    bigint not null,
  data                          timestamp not null,
  etr                           integer not null,
  eor                           integer not null,
  nome_usuario                  varchar(255),
  constraint ck_reserva_etr check (etr in (0,1,2)),
  constraint ck_reserva_eor check (eor in (0,1,2,3)),
  constraint pk_reserva primary key (id)
);
create sequence reserva_seq;

create table sugestao (
  id                            bigint not null,
  usuario_id                    bigint not null,
  funcionario_id                bigint,
  data_criacao                  timestamp not null,
  comentario                    varchar(400) not null,
  resposta                      varchar(300),
  etr                           integer not null,
  eor                           integer not null,
  tipo_avaliacao                varchar(22),
  constraint ck_sugestao_etr check (etr in (0,1,2)),
  constraint ck_sugestao_eor check (eor in (0,1,2,3)),
  constraint pk_sugestao primary key (id)
);
create sequence sugestao_seq;

create table tipo_refeicao (
  id                            integer not null,
  tipo_refeicao                 varchar(15) not null,
  preco                         double not null,
  descricao                     varchar(255),
  constraint pk_tipo_refeicao primary key (id)
);
create sequence tipo_refeicao_seq;

create table transacao (
  id                            integer not null,
  id_pagamento                  varchar(255),
  id_pedido                     varchar(255),
  valor                         integer not null,
  forma_pagamento               integer not null,
  saldo_atual                   integer,
  status                        integer,
  usuario_id                    bigint not null,
  data_atualizacao              timestamp not null,
  constraint ck_transacao_forma_pagamento check (forma_pagamento in (0,1,2)),
  constraint ck_transacao_status check (status in (0,1,2,3,4,5,6,7,8,9,10,11)),
  constraint pk_transacao primary key (id)
);
create sequence transacao_seq;

create table usuario (
  id                            bigint not null,
  ava_id                        integer not null,
  token                         varchar(255),
  caminho_imagem                varchar(255),
  username                      varchar(35) not null,
  senha                         varchar(60) not null,
  nome                          varchar(60) not null,
  cpf                           varchar(15) not null,
  matricula                     varchar(13),
  imagem_small                  varchar(255),
  cidade                        varchar(60),
  pais                          varchar(40),
  instituicao                   varchar(70),
  email                         varchar(60),
  departamento                  varchar(60),
  saldo                         integer,
  digital                       varchar(255),
  is_residente                  boolean,
  codigo                        bigint,
  data_criacao                  timestamp not null,
  data_modificacao              timestamp not null,
  constraint pk_usuario primary key (id)
);
create sequence usuario_seq;

create table usuario_cozzi (
  id                            bigint not null,
  login                         varchar(255),
  senha                         varchar(255),
  funcao                        varchar(255),
  constraint pk_usuario_cozzi primary key (id)
);
create sequence usuario_cozzi_seq;

alter table avaliacao add constraint fk_avaliacao_usuario_id foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_avaliacao_usuario_id on avaliacao (usuario_id);

alter table cartao add constraint fk_cartao_usuario_id foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;

alter table entrada_ru add constraint fk_entrada_ru_usuario_id foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_entrada_ru_usuario_id on entrada_ru (usuario_id);

alter table reserva add constraint fk_reserva_usuario_id foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_reserva_usuario_id on reserva (usuario_id);

alter table sugestao add constraint fk_sugestao_usuario_id foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_sugestao_usuario_id on sugestao (usuario_id);

alter table sugestao add constraint fk_sugestao_funcionario_id foreign key (funcionario_id) references usuario_cozzi (id) on delete restrict on update restrict;
create index ix_sugestao_funcionario_id on sugestao (funcionario_id);

alter table transacao add constraint fk_transacao_usuario_id foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_transacao_usuario_id on transacao (usuario_id);


# --- !Downs

alter table avaliacao drop constraint if exists fk_avaliacao_usuario_id;
drop index if exists ix_avaliacao_usuario_id;

alter table cartao drop constraint if exists fk_cartao_usuario_id;

alter table entrada_ru drop constraint if exists fk_entrada_ru_usuario_id;
drop index if exists ix_entrada_ru_usuario_id;

alter table reserva drop constraint if exists fk_reserva_usuario_id;
drop index if exists ix_reserva_usuario_id;

alter table sugestao drop constraint if exists fk_sugestao_usuario_id;
drop index if exists ix_sugestao_usuario_id;

alter table sugestao drop constraint if exists fk_sugestao_funcionario_id;
drop index if exists ix_sugestao_funcionario_id;

alter table transacao drop constraint if exists fk_transacao_usuario_id;
drop index if exists ix_transacao_usuario_id;

drop table if exists avaliacao;

drop table if exists cardapio;
drop sequence if exists cardapio_seq;

drop table if exists cardapio_dia;

drop table if exists cartao;
drop sequence if exists cartao_seq;

drop table if exists entrada_ru;
drop sequence if exists entrada_ru_seq;

drop table if exists forma_pagamento;
drop sequence if exists forma_pagamento_seq;

drop table if exists opcao_refeicao;
drop sequence if exists opcao_refeicao_seq;

drop table if exists reserva;
drop sequence if exists reserva_seq;

drop table if exists sugestao;
drop sequence if exists sugestao_seq;

drop table if exists tipo_refeicao;
drop sequence if exists tipo_refeicao_seq;

drop table if exists transacao;
drop sequence if exists transacao_seq;

drop table if exists usuario;
drop sequence if exists usuario_seq;

drop table if exists usuario_cozzi;
drop sequence if exists usuario_cozzi_seq;

