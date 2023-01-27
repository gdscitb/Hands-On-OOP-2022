#ifndef DATABASE_H
#define DATABASE_H

#include <vector>

#include "Classroom.h"
#include "nlohmann/json.hpp"

    using namespace std;
    using namespace nlohmann;

    class DatabaseManager {
        private:
            vector<Classroom> classroomList;
            
    };


#endif // !DATABASE_H