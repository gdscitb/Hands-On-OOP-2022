#ifndef TEACHER_H
#define TEACHER_H

    #include <string>

    #include <nlohmann/json.hpp>

    using namespace std;
    using namespace nlohmann;

    class Teacher {
        private :
            int teacherID;
            string teacherName;

        protected :
            json asJSON();

    };

#endif // !TEACHER_H
