"use strict";
exports.__esModule = true;
exports.Competition = void 0;
var Competition = /** @class */ (function () {
    function Competition(cars, distance) {
        this.cars = cars;
        this.distance = distance;
        this.ranks = this.cars;
    }
    Competition.prototype.setCars = function (cars) {
        this.cars = cars;
    };
    Competition.prototype.getCars = function () {
        console.log("Mobil yang terdaftar: ");
        for (var i in this.cars) {
            console.log(Number(i) + 1 + ". " + this.cars[i].getName() + ": " + this.cars[i].getSpeed() + " MPH");
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
        for (var _i = 0, _a = this.cars; _i < _a.length; _i++) {
            var car = _a[_i];
            car.move();
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
            var car = _a[_i];
            car.times = this.distance / car.getSpeed();
        }
    };
    Competition.prototype.winner = function () {
        console.log('\nPemenang Kompetisi : ');
        this.ranks.forEach(function (car, index) {
            console.log(index + 1 + ". " + car.getName() + " : " + car.times.toFixed(2) + " jam");
        });
    };
    return Competition;
}());
exports.Competition = Competition;
