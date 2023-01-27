
export declare interface account {
    _username: string;
    _password: string | number;
    _id: number;
    balance: number;
    isMerchant: boolean;
    status: string;
    /**
     * @returns current username user object
     * */
    getUsername(): string;

    /**
     * @description change current username of user object
     * @param newUsername new username
     * */
    changeUsername(newUsername: string): void;

    /**
     * @returns current user password
     * */
    getPassword(): string | number;

    /**
     * @description change current password of user object
     * @param newPassword new password
     * */
    changePassword(newPassword: number | string): void;

    /**
     * @returns top up user balance
     * */
    topUpBalance(): void;
}

export declare interface paymentObject {
    username: string;
    item_id: string | number;
    cost: number;
    status?: string;
}

export declare interface customer {
    username: string;
    item_id: string | number;
    total_cost: number;
    status: string; // paid or unpaid
    appeal?: boolean;
}

export declare interface authentication {
    database: credential[];
}

export declare interface credential {
    username: string;
    password: string | number;
    balance: number;
    loggedIn?: boolean;
    isMerchant: boolean;
}