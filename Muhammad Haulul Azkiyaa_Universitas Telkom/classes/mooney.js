"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.Mooney = void 0;
var motor_1 = require("./motor");
var Mooney = /** @class */ (function (_super) {
    __extends(Mooney, _super);
    function Mooney(speed, codename, rider) {
        var _this = _super.call(this, 'Mooney VR46 Racing Team', speed, codename) || this;
        _this.rider = rider;
        return _this;
    }
    Mooney.prototype.move = function () {
        console.log("".concat(this.getName(), " berjalan dengan kecepatan ").concat(this.getSpeed(), " mph"));
    };
    Mooney.prototype.getName = function () {
        return "".concat(this.rider, "  [").concat(this.brand, "]");
    };
    return Mooney;
}(motor_1.Motor));
exports.Mooney = Mooney;
