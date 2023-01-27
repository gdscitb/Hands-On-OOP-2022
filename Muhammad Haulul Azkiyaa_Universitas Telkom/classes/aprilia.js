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
exports.Aprilia = void 0;
var motor_1 = require("./motor");
var Aprilia = /** @class */ (function (_super) {
    __extends(Aprilia, _super);
    function Aprilia(speed, codename, rider) {
        var _this = _super.call(this, 'Aprilia Racing', speed, codename) || this;
        _this.rider = rider;
        return _this;
    }
    Aprilia.prototype.move = function () {
        console.log("".concat(this.getName(), " berjalan dengan kecepatan ").concat(this.getSpeed(), " mph"));
    };
    Aprilia.prototype.getName = function () {
        return "".concat(this.rider, "  [").concat(this.brand, "]");
    };
    return Aprilia;
}(motor_1.Motor));
exports.Aprilia = Aprilia;
