#ifndef USER_H
#define USER_H

#include <iostream>
#include <string>
#include <time.h>

#include "randint.h"

#include "nlohmann/json.hpp"

    using namespace std;
    using namespace nlohmann;


    class User {
        protected : 
            int id;
            string name;

        public :
            int getid();
            string getName();

    };


#endif // !USER_H