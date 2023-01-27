#ifndef CLASSROOM_H
#define CLASSROOM_H

#include "Student.h"
#include "Teacher.h"

#include <vector>
    using namespace std;

    class Classroom {
        private :
            int classroomId;
            Teacher teacher;
            vector<Student> studentList;

        public :
            void storeClassroom();

        // public :
            
    };


#endif // !CLASSROOM_H