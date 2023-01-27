"use strict";
exports.__esModule = true;
exports.Competition = void 0;
var Competition = /** @class */ (function () {
    function Competition(motors, distance) {
        this.motors = motors;
        this.distance = distance;
        this.ranks = this.motors;
    }
    Competition.prototype.setMotors = function (motors) {
        this.motors = motors;
    };
    Competition.prototype.getMotors = function () {
        console.log("Mobil yang terdaftar: ");
        for (var i in this.motors) {
            console.log("".concat(Number(i) + 1, ". ").concat(this.motors[i].getName(), ": ").concat(this.motors[i].getSpeed(), " MPH"));
        }
    };
    Competition.prototype.setDistance = function (distance) {
        this.distance = distance;
    };
    Competition.prototype.getDistance = function () {
        return this.distance;
    };
    Competition.prototype.race = function () {
        console.log('Lomba balap mobil dimulai!!');
        for (var _i = 0, _a = this.motors; _i < _a.length; _i++) {
            var motor = _a[_i];
            motor.move();
        }
        this.setRaceTime();
        this.ranks.sort(function (obj1, obj2) {
            if (obj1.times > obj2.times) {
                return 1;
            }
            else if (obj1.times < obj2.times) {
                return -1;
            }
            else {
                return 0;
            }
        });
        console.log('Lomba balap mobil telah berakhir');
    };
    Competition.prototype.setRaceTime = function () {
        for (var _i = 0, _a = this.ranks; _i < _a.length; _i++) {
            var motor = _a[_i];
            motor.times = this.distance / motor.getSpeed();
        }
    };
    Competition.prototype.winner = function () {
        console.log('\n================ Pemenang Kompetisi : ===============');
        this.ranks.forEach(function (motor, index) {
            console.log("".concat(index + 1, ". ").concat(motor.getName(), " : ").concat(motor.times.toFixed(2), " jam"));
        });
    };
    return Competition;
}());
exports.Competition = Competition;
