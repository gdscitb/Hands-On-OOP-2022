"use strict";
exports.__esModule = true;
exports.Decorator = void 0;
var Decorator = /** @class */ (function () {
    function Decorator(lap) {
        this.laps = {};
        this.lap = lap;
    }
    Decorator.prototype.setLaps = function (laps) {
        var currLaps = this.lap.getLaps();
        this.laps = laps * currLaps;
    };
    Decorator.prototype.getLaps = function () {
        return this.laps;
    };
    return Decorator;
}());
exports.Decorator = Decorator;
