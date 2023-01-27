"use strict";
exports.__esModule = true;
exports.Laps = void 0;
var Laps = /** @class */ (function () {
    function Laps() {
        this.laps = {};
    }
    Laps.prototype.setLaps = function (laps) {
        this.laps = laps;
    };
    Laps.prototype.getLaps = function () {
        return this.laps;
    };
    return Laps;
}());
exports.Laps = Laps;
