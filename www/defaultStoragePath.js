
var exec = require('cordova/exec');

var DefaultStoragePath = function() {
    if (!(this instanceof DefaultStoragePath)) {
        return new DefaultStoragePath();
    }
};

DefaultStoragePath.prototype.getDefaultStoragePath = function(successCallback, errorCallback) {
    exec(successCallback, errorCallback, "DefaultStoragePath", "getDefaultStoragePath", []);
};

module.exports = DefaultStoragePath;

