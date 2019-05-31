window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.auth = window.blockly.js.blockly.auth || {};
window.blockly.js.blockly.auth.LoginFacebook = window.blockly.js.blockly.auth.LoginFacebook || {};

/**
 * loginFacebook
 */
window.blockly.js.blockly.auth.LoginFacebook.Executar = function() {

  this.cronapi.screen.notify('success','passouvis');
  this.cronapi.social.sociaLogin('facebook', 'true');
}
