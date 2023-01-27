"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.McLaren = void 0;
var car_1 = require("./car");
var McLaren = /** @class */ (function (_super) {
    __extends(McLaren, _super);
    function McLaren(speed, price, model) {
        var _this = _super.call(this, 'McLaren', speed, price) || this;
        _this.model = model;
        return _this;
    }
    McLaren.prototype.move = function () {
        console.log(this.getName() + " berjalan dengan kecepatan " + this.getSpeed() + " mph");
    };
    McLaren.prototype.getName = function () {
        return this.brand + " " + this.model;
    };
    return McLaren;
}(car_1.Car));
exports.McLaren = McLaren;
