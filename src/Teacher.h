#ifndef TEACHER_H
#define TEACHER_H

#include "User.h"

    class Teacher : public User {
        public :
            Teacher();
            Teacher(int, string);

            json asJSON();


    };

#endif // !TEACHER_H
