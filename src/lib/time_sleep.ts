/**
 * Set time sleep for given milliseconds
 * @param ms millis
 * @returns timeout Promise
 */
export const sleep = async (ms: number) => {
    return new Promise (resolve => setTimeout(resolve, ms));
}


