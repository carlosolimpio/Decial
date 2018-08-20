# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table ponto_risco (
  id                            bigint auto_increment not null,
  cep                           varchar(255),
  solicitacao_bairro            varchar(255),
  solicitacao_endereco          varchar(255),
  solicitacao_descricao         varchar(255),
  endereco_referencia           varchar(255),
  status                        integer,
  latitude                      float,
  longitude                     float,
  proceso_numero                bigint,
  data_solicitacao              date,
  data_aceitacao                date,
  risco                         integer,
  avaliador_id                  bigint,
  constraint ck_ponto_risco_status check (status in (0,1)),
  constraint ck_ponto_risco_risco check (risco in (0,1,2)),
  constraint pk_ponto_risco primary key (id)
);

create table usuario (
  id                            bigint auto_increment not null,
  login                         varchar(255),
  senha                         varchar(255),
  email                         varchar(255),
  nome                          varchar(255),
  sobre_nome                    varchar(255),
  rua                           varchar(255),
  cidade                        varchar(255),
  pais                          varchar(255),
  cep                           varchar(255),
  tipo                          integer,
  constraint ck_usuario_tipo check (tipo in (0,1)),
  constraint pk_usuario primary key (id)
);


# --- !Downs

drop table if exists ponto_risco;

drop table if exists usuario;

