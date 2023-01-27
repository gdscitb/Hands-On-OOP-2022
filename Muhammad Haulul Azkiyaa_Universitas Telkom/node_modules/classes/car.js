"use strict";
exports.__esModule = true;
exports.Car = void 0;
var Car = /** @class */ (function () {
    function Car(brand, speed, price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }
    Car.prototype.setBrand = function (brand) {
        this.brand = brand;
    };
    ;
    Car.prototype.getBrand = function (brand) {
        return this.brand;
    };
    ;
    Car.prototype.setSpeed = function (speed) {
        this.speed = speed;
    };
    ;
    Car.prototype.getSpeed = function () {
        return this.speed;
    };
    Car.prototype.setPrice = function (price) {
        this.price = price;
    };
    ;
    Car.prototype.getPrice = function () {
        return "$" + this.price;
    };
    return Car;
}());
exports.Car = Car;
