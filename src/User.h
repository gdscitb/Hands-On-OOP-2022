#ifndef USER_H
#define USER_H

#include <string>
#include <nlohmann/json.hpp>

    using namespace std;
    using namespace nlohmann;

    class User {
        protected : 
            int id;
            string name;
    

    };


#endif // !USER_H