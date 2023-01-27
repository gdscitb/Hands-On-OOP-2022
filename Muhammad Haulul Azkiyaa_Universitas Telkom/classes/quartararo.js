"use strict";
exports.__esModule = true;
exports.Quartararo = void 0;
var Quartararo = /** @class */ (function () {
    function Quartararo(rider, speed, codename) {
        this.brand = 'Monster Energy Yamaha MotoGP';
        this.rider = rider;
        this.speed = speed;
        this.codename = codename;
    }
    Quartararo.prototype.setBrand = function (brand) {
        this.brand = brand;
    };
    ;
    Quartararo.prototype.getBrand = function (brand) {
        return this.brand;
    };
    ;
    Quartararo.prototype.setSpeed = function (speed) {
        this.speed = speed;
    };
    ;
    Quartararo.prototype.getSpeed = function () {
        return this.speed;
    };
    Quartararo.prototype.setCodeName = function (codename) {
        this.codename = codename;
    };
    ;
    Quartararo.prototype.getCodeName = function () {
        return "$".concat(this.codename);
    };
    Quartararo.prototype.move = function () {
        console.log("".concat(this.getName(), " berjalan dengan kecepatan ").concat(this.getSpeed(), " mph"));
    };
    Quartararo.prototype.getName = function () {
        return "".concat(this.rider, "  [").concat(this.brand, "]");
    };
    return Quartararo;
}());
exports.Quartararo = Quartararo;
