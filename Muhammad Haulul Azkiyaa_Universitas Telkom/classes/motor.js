"use strict";
exports.__esModule = true;
exports.Motor = void 0;
var Motor = /** @class */ (function () {
    function Motor(brand, speed, codename) {
        this.brand = brand;
        this.speed = speed;
        this.codename = codename;
    }
    Motor.prototype.setBrand = function (brand) {
        this.brand = brand;
    };
    ;
    Motor.prototype.getBrand = function (brand) {
        return this.brand;
    };
    ;
    Motor.prototype.setSpeed = function (speed) {
        this.speed = speed;
    };
    ;
    Motor.prototype.getSpeed = function () {
        return this.speed;
    };
    Motor.prototype.setCodeName = function (codename) {
        this.codename = codename;
    };
    ;
    Motor.prototype.getCodeName = function () {
        return "$".concat(this.codename);
    };
    return Motor;
}());
exports.Motor = Motor;
