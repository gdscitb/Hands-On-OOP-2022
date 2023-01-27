"use strict";
exports.__esModule = true;
exports.toCapitallize = void 0;
/**
 * Takes in full string and return the capitalized version
 * @param str input string
 * @returns capitalized string
 * */
var toCapitallize = function (str) {
    var tempStr;
    var rawStrArr = str.split(" ");
    rawStrArr.forEach(function (ele, index) {
        tempStr = ele.toLowerCase();
        var strArr = tempStr.split("");
        strArr[0] = strArr[0].toUpperCase();
        rawStrArr[index] = strArr.join("");
    });
    tempStr = rawStrArr.join(" ");
    return tempStr;
};
exports.toCapitallize = toCapitallize;
