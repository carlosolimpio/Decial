webpackJsonp([7],{

/***/ 1015:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__babel_loader_node_modules_vue_loader_lib_selector_type_script_index_0_BasixModal_vue__ = __webpack_require__(827);
/* unused harmony namespace reexport */
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__node_modules_vue_loader_lib_template_compiler_index_id_data_v_20b9b150_hasScoped_false_buble_transforms_node_modules_vue_loader_lib_selector_type_template_index_0_BasixModal_vue__ = __webpack_require__(1018);
function injectStyle (ssrContext) {
  __webpack_require__(1016)
}
var normalizeComponent = __webpack_require__(0)
/* script */


/* template */

/* template functional */
var __vue_template_functional__ = false
/* styles */
var __vue_styles__ = injectStyle
/* scopeId */
var __vue_scopeId__ = null
/* moduleIdentifier (server only) */
var __vue_module_identifier__ = null
var Component = normalizeComponent(
  __WEBPACK_IMPORTED_MODULE_0__babel_loader_node_modules_vue_loader_lib_selector_type_script_index_0_BasixModal_vue__["a" /* default */],
  __WEBPACK_IMPORTED_MODULE_1__node_modules_vue_loader_lib_template_compiler_index_id_data_v_20b9b150_hasScoped_false_buble_transforms_node_modules_vue_loader_lib_selector_type_template_index_0_BasixModal_vue__["a" /* default */],
  __vue_template_functional__,
  __vue_styles__,
  __vue_scopeId__,
  __vue_module_identifier__
)

/* harmony default export */ __webpack_exports__["a"] = (Component.exports);


/***/ }),

/***/ 1016:
/***/ (function(module, exports, __webpack_require__) {

// style-loader: Adds some css to the DOM by adding a <style> tag

// load the styles
var content = __webpack_require__(1017);
if(typeof content === 'string') content = [[module.i, content, '']];
if(content.locals) module.exports = content.locals;
// add the styles to the DOM
var update = __webpack_require__(2)("a22051be", content, true, {});

/***/ }),

/***/ 1017:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(1)(false);
// imports


// module
exports.push([module.i, ".slide-enter-active{animation:slide-in 3s fade forwards}.slide-leave-active{animation:slide-out 3s fade forwards}@keyframes slide-in{0%{transform:translateY(250px)}to{transform:translateY(0)}}@keyframes slide-out{0%{transform:translateY(0)}to{transform:translateY(250px)}}.modal{display:block}.modal-backdrop,.modal-dialog{transition:all .5s ease}.modal-enter .modal-dialog,.modal-leave-active .modal-dialog{opacity:0;transform:translateY(-30%)}.modal-enter .modal-backdrop,.modal-leave-active .modal-backdrop{opacity:0}.modal-backdrop{opacity:.5}.modal-header{height:55px;padding:0 1.6rem;border-bottom:2px solid #eee;font-size:1.2rem;display:flex;align-items:center}.modal-content{border-radius:0}.modal-footer{justify-content:center;padding:0 2px;padding-bottom:5px;flex-wrap:wrap}.modal-footer .btn{margin:0 10px 20px}", ""]);

// exports


/***/ }),

/***/ 1018:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
var render = function () {var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;return _c('transition',{attrs:{"name":"slide","duration":_vm.duration}},[_c('div',{directives:[{name:"show",rawName:"v-show",value:(_vm.show),expression:"show"}],staticClass:"modal-container"},[_c('div',{staticClass:"modal",on:{"click":function($event){if($event.target !== $event.currentTarget){ return null; }return _vm.clickMask($event)}}},[_c('div',{staticClass:"modal-dialog",class:_vm.modalClass},[_c('div',{staticClass:"modal-content"},[_c('div',{staticClass:"modal-header"},[_vm._t("header",[_c('div',{staticClass:"modal-title"},[_vm._t("title")],2)])],2),_vm._v(" "),_c('div',{staticClass:"modal-body"},[_vm._t("default")],2),_vm._v(" "),_c('div',{staticClass:"modal-footer"},[_vm._t("footer",[_c('button',{staticClass:"mt-3",class:_vm.okClass,attrs:{"type":"button"},on:{"click":_vm.ok}},[_vm._v(_vm._s(_vm.okText))]),_vm._v(" "),_c('button',{staticClass:"mt-3",class:_vm.cancelClass,attrs:{"type":"button","data-dismiss":"modal"},on:{"click":_vm.cancel}},[_vm._v(_vm._s(_vm.cancelText))])])],2)])])]),_vm._v(" "),_c('div',{staticClass:"modal-backdrop"})])])}
var staticRenderFns = []
var esExports = { render: render, staticRenderFns: staticRenderFns }
/* harmony default export */ __webpack_exports__["a"] = (esExports);

/***/ }),

/***/ 1019:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
var render = function () {var _vm=this;var _h=_vm.$createElement;var _c=_vm._self._c||_h;return _c('div',{staticClass:"basix-modals row"},[_c('div',{staticClass:"col-md-12"},[_c('card',{attrs:{"header-text":"Modals","header-icon":"fa fa-align-justify"}},[_c('button',{staticClass:"btn btn-secondary",attrs:{"type":"button"},on:{"click":function($event){_vm.showSmallModal()}}},[_vm._v("\n              Small\n            ")]),_vm._v(" "),_c('button',{staticClass:"btn btn-secondary",attrs:{"type":"button"},on:{"click":function($event){_vm.showMediumModal()}}},[_vm._v("\n              Medium\n            ")]),_vm._v(" "),_c('button',{staticClass:"btn btn-secondary",attrs:{"type":"button"},on:{"click":function($event){_vm.showLargeModal()}}},[_vm._v("\n              Large\n            ")]),_vm._v(" "),_c('button',{staticClass:"btn btn-secondary",attrs:{"type":"button"},on:{"click":function($event){_vm.showScrollingModal()}}},[_vm._v("\n              Scrolling\n            ")]),_vm._v(" "),_c('button',{staticClass:"btn btn-secondary",attrs:{"type":"button"},on:{"click":function($event){_vm.showStaticModal()}}},[_vm._v("\n              Static\n            ")]),_vm._v(" "),_c('basix-modal',{ref:"smallModal",attrs:{"show":_vm.show,"small":true,"cancelClass":'btn btn-secondary'},on:{"update:show":function($event){_vm.show=$event}}},[_c('div',{attrs:{"slot":"title"},slot:"title"},[_vm._v("Small modal")]),_vm._v(" "),_c('p',[_vm._v("\n                There are three species of zebras: the plains zebra, the mountain zebra and the Grévy's zebra. The plains zebra\n                and the mountain zebra belong to the subgenus Hippotigris, but Grévy's zebra is the sole species of subgenus\n                Dolichohippus. The latter resembles an ass, to which it is closely related, while the former two are more\n                horse-like. All three belong to the genus Equus, along with other living equids.\n              ")])]),_vm._v(" "),_c('basix-modal',{ref:"mediumModal",attrs:{"show":_vm.show},on:{"update:show":function($event){_vm.show=$event}}},[_c('div',{attrs:{"slot":"title"},slot:"title"},[_vm._v("Medium modal")]),_vm._v(" "),_c('p',[_vm._v("\n                There are three species of zebras: the plains zebra, the mountain zebra and the Grévy's zebra. The plains zebra\n                and the mountain zebra belong to the subgenus Hippotigris, but Grévy's zebra is the sole species of subgenus\n                Dolichohippus. The latter resembles an ass, to which it is closely related, while the former two are more\n                horse-like. All three belong to the genus Equus, along with other living equids.\n              ")])]),_vm._v(" "),_c('basix-modal',{ref:"largeModal",attrs:{"show":_vm.show,"large":true},on:{"update:show":function($event){_vm.show=$event}}},[_c('div',{attrs:{"slot":"title"},slot:"title"},[_vm._v("Large Modal")]),_vm._v(" "),_c('p',[_vm._v("\n                There are three species of zebras: the plains zebra, the mountain zebra and the Grévy's zebra. The plains zebra\n                and the mountain zebra belong to the subgenus Hippotigris, but Grévy's zebra is the sole species of subgenus\n                Dolichohippus. The latter resembles an ass, to which it is closely related, while the former two are more\n                horse-like. All three belong to the genus Equus, along with other living equids.\n              ")])]),_vm._v(" "),_c('basix-modal',{ref:"scrollingeModal",attrs:{"show":_vm.show,"large":true},on:{"update:show":function($event){_vm.show=$event}}},[_c('div',{attrs:{"slot":"title"},slot:"title"},[_vm._v("Scrolling Long Content Modal")]),_vm._v(" "),_c('p',[_vm._v("\n                Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. "),_c('br'),_vm._v("\n\n                Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor."),_c('br'),_vm._v("\n\n                Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla."),_c('br'),_vm._v("\n\n                Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros."),_c('br'),_vm._v("\n\n                Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor."),_c('br'),_vm._v("\n\n                Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla."),_c('br'),_vm._v("\n\n                Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros."),_c('br'),_vm._v("\n\n                Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor."),_c('br'),_vm._v("\n\n                Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla."),_c('br'),_vm._v("\n\n                Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros."),_c('br'),_vm._v("\n\n                Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor."),_c('br'),_vm._v("\n\n                Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla."),_c('br'),_vm._v("\n\n                Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros."),_c('br'),_vm._v("\n\n                Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor."),_c('br'),_vm._v("\n\n                Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla."),_c('br'),_vm._v("\n\n                Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros."),_c('br'),_vm._v("\n\n                Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor."),_c('br'),_vm._v("\n\n                Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla.\n              ")])]),_vm._v(" "),_c('basix-modal',{ref:"staticModal",attrs:{"show":_vm.show,"small":true,"force":true,"cancelClass":'btn btn-secondary',"okText":'CLOSE'},on:{"update:show":function($event){_vm.show=$event}}},[_c('div',{attrs:{"slot":"title"},slot:"title"},[_vm._v("Static Modal")]),_vm._v(" "),_c('p',[_vm._v("\n                This is a static modal, backdrop click will not close it.\n              ")])])],1)],1)])}
var staticRenderFns = []
var esExports = { render: render, staticRenderFns: staticRenderFns }
/* harmony default export */ __webpack_exports__["a"] = (esExports);

/***/ }),

/***/ 40:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__babel_loader_node_modules_vue_loader_lib_selector_type_script_index_0_Modals_vue__ = __webpack_require__(826);
/* empty harmony namespace reexport */
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__node_modules_vue_loader_lib_template_compiler_index_id_data_v_3cc1f077_hasScoped_false_buble_transforms_node_modules_vue_loader_lib_selector_type_template_index_0_Modals_vue__ = __webpack_require__(1019);
var normalizeComponent = __webpack_require__(0)
/* script */


/* template */

/* template functional */
var __vue_template_functional__ = false
/* styles */
var __vue_styles__ = null
/* scopeId */
var __vue_scopeId__ = null
/* moduleIdentifier (server only) */
var __vue_module_identifier__ = null
var Component = normalizeComponent(
  __WEBPACK_IMPORTED_MODULE_0__babel_loader_node_modules_vue_loader_lib_selector_type_script_index_0_Modals_vue__["a" /* default */],
  __WEBPACK_IMPORTED_MODULE_1__node_modules_vue_loader_lib_template_compiler_index_id_data_v_3cc1f077_hasScoped_false_buble_transforms_node_modules_vue_loader_lib_selector_type_template_index_0_Modals_vue__["a" /* default */],
  __vue_template_functional__,
  __vue_styles__,
  __vue_scopeId__,
  __vue_module_identifier__
)

/* harmony default export */ __webpack_exports__["default"] = (Component.exports);


/***/ }),

/***/ 826:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__widgets_CardTemplate_vue__ = __webpack_require__(41);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__basix_modal_BasixModal_vue__ = __webpack_require__(1015);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//



/* harmony default export */ __webpack_exports__["a"] = ({
  //name: 'basix-modals',
  data() {
    return {
      show: true
    };
  },
  components: {
    Card: __WEBPACK_IMPORTED_MODULE_0__widgets_CardTemplate_vue__["a" /* default */],
    BasixModal: __WEBPACK_IMPORTED_MODULE_1__basix_modal_BasixModal_vue__["a" /* default */]
  },
  methods: {
    showSmallModal() {
      this.$refs.smallModal.open();
    },
    showMediumModal() {
      this.$refs.mediumModal.open();
    },
    showLargeModal() {
      this.$refs.largeModal.open();
    },
    showScrollingModal() {
      this.$refs.scrollingeModal.open();
    },
    showStaticModal() {
      this.$refs.staticModal.open();
    }
  }

});

/***/ }),

/***/ 827:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

/* harmony default export */ __webpack_exports__["a"] = ({
  name: 'basix-modal',
  props: {
    transition: {
      type: String,
      default: 'modal'
    },
    small: {
      type: Boolean,
      default: false
    },
    large: {
      type: Boolean,
      default: false
    },
    force: {
      type: Boolean,
      default: false
    },
    okText: {
      type: String,
      default: 'CONFIRM'
    },
    cancelText: {
      type: String,
      default: 'CANCEL'
    },
    okClass: {
      type: String,
      default: 'btn btn-primary'
    },
    cancelClass: {
      type: String,
      default: 'btn btn-secondary'
    }
  },
  data() {
    return {
      show: false,
      duration: 200
    };
  },
  computed: {
    modalClass() {
      return {
        'modal-lg': this.large,
        'modal-sm': this.small
      };
    }
  },
  created() {
    if (this.show) {
      document.body.className += ' modal-open';
    }
  },
  beforeDestroy() {
    document.body.className = document.body.className.replace(/\s?modal-open/, '');
  },
  watch: {
    show(value) {
      if (value) {
        document.body.className += ' modal-open';
      } else {
        window.setTimeout(() => {
          document.body.className = document.body.className.replace(/\s?modal-open/, '');
        }, this.duration);
      }
    }
  },
  methods: {
    ok() {
      this.$emit('ok');
      this.show = false;
    },
    cancel() {
      this.$emit('cancel');
      this.show = false;
    },
    clickMask() {
      if (!this.force) {
        this.cancel();
      }
    },
    open() {
      this.show = true;
    }
  }
});

/***/ })

});
//# sourceMappingURL=7.build.js.map