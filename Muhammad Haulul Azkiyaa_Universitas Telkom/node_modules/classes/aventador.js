"use strict";
exports.__esModule = true;
exports.Aventador = void 0;
var Aventador = /** @class */ (function () {
    function Aventador(model, speed, price) {
        this.brand = 'Lamborghini';
        this.model = model;
        this.speed = speed;
        this.price = price;
    }
    Aventador.prototype.setBrand = function (brand) {
        this.brand = brand;
    };
    ;
    Aventador.prototype.getBrand = function (brand) {
        return this.brand;
    };
    ;
    Aventador.prototype.setSpeed = function (speed) {
        this.speed = speed;
    };
    ;
    Aventador.prototype.getSpeed = function () {
        return this.speed;
    };
    Aventador.prototype.setPrice = function (price) {
        this.price = price;
    };
    ;
    Aventador.prototype.getPrice = function () {
        return "$" + this.price;
    };
    Aventador.prototype.move = function () {
        console.log(this.getName() + " berjalan dengan kecepatan " + this.getSpeed() + " mph");
    };
    Aventador.prototype.getName = function () {
        return this.brand + " " + this.model;
    };
    return Aventador;
}());
exports.Aventador = Aventador;
