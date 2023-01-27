import * as readline from "readline"
import { toCapitallize } from "./string_modifier";

/**
 * Readline module built in Node
 */
export const stdin =  readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

/**
 * input from console
 * @async true
 * @param user_data captured string from console
 * @returns full string of user input
 */
export const inputData = async (user_data: string) => {
    let userInput: string = await new Promise(resolve => stdin.question(`Enter ${user_data.toLowerCase()}: `, resolve));
    return toCapitallize(userInput);
}