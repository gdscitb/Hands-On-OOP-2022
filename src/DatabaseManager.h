#ifndef DATABASE_H
#define DATABASE_H

#include <vector>
#include <iostream>
#include <fstream>

#include "Classroom.h"
#include "nlohmann/json.hpp"

    using namespace std;
    using namespace nlohmann;

    class DatabaseManager {
        private:
            vector<Classroom> classroomList;

        public :
            void addClassroom(Classroom);

            void StoreData();
            void LoadData();

            void displayDatabase();
            
    };


#endif // !DATABASE_H