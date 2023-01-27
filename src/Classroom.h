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
            // vector<Student> studentList;

        public :
            vector<Student> studentList;
            Classroom(int, Teacher);

            void addStudent(Student);

            json asJSON();

            void storeClassroom();

        // public :
            
    };


#endif // !CLASSROOM_H