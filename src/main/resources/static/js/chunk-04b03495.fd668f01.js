(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-04b03495"],{"0d96":function(e,t,r){"use strict";r.r(t);var s=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{staticClass:"newPost"},[e.hasError?r("div",[r("displayError",{attrs:{errors:e.errors}})],1):e._e(),r("form",{on:{submit:e.addNewPost}},[r("label",{attrs:{for:"title"}},[e._v(" title: ")]),r("p",[r("input",{directives:[{name:"model",rawName:"v-model",value:e.title,expression:"title"}],attrs:{type:"text",name:"title"},domProps:{value:e.title},on:{input:function(t){t.target.composing||(e.title=t.target.value)}}})]),r("label",{attrs:{for:"message"}},[e._v(" message: ")]),r("p",[r("textarea",{directives:[{name:"model",rawName:"v-model",value:e.message,expression:"message"}],attrs:{name:"message",cols:"50",rows:"10"},domProps:{value:e.message},on:{input:function(t){t.target.composing||(e.message=t.target.value)}}})]),r("input",{attrs:{type:"submit",value:"Submit"}})])])},a=[],n=r("bc3a"),o=r.n(n),l=r("42b3"),i={name:"newPost",components:{displayError:l["a"]},data:function(){return{title:null,message:null,hasError:!1,errors:null}},methods:{addNewPost:function(e){var t=this;e.preventDefault(),this.hasError=!1,this.errors=null;var r={title:this.title,message:this.message};o.a.post("http://localhost:9000/api/post",r).then((function(){return t.$router.push("/")})).catch((function(e){t.errors=e.response.data.errors,t.hasError=!0}))}}},u=i,c=r("2877"),m=Object(c["a"])(u,s,a,!1,null,null,null);t["default"]=m.exports},"42b3":function(e,t,r){"use strict";var s=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("ul",{staticClass:"error"},e._l(e.errors,(function(t,s){return r("li",{key:s},[e._v(" "+e._s(t.defaultMessage)+" ")])})),0)},a=[],n={name:"displayError",props:["errors"]},o=n,l=(r("6b9f"),r("2877")),i=Object(l["a"])(o,s,a,!1,null,"24a92203",null);t["a"]=i.exports},"6b9f":function(e,t,r){"use strict";var s=r("9ed2"),a=r.n(s);a.a},"9ed2":function(e,t,r){}}]);
//# sourceMappingURL=chunk-04b03495.fd668f01.js.map