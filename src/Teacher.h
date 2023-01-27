#ifndef TEACHER_H
#define TEACHER_H

#include "User.h"
// #include "randint.h"

    class Teacher : public User {
        public :
            Teacher();
            Teacher(string);
            Teacher(int, string);

            json asJSON();


    };

#endif // !TEACHER_H
