/**
 * Takes in full string and return the capitalized version
 * @param str input string
 * @returns capitalized string
 * */
export const toCapitallize = (str: string) => {
    let tempStr: string;
    let rawStrArr = str.split(" ");
    rawStrArr.forEach((ele, index) => {
        tempStr = ele.toLowerCase();
        let strArr = tempStr.split("");
        strArr[0] = strArr[0].toUpperCase();
        rawStrArr[index] = strArr.join("");
    })
    tempStr = rawStrArr.join(" ");
    return tempStr;
}