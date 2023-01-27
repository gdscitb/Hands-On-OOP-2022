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
            Classroom(Teacher);
            Classroom(int, Teacher);
            
            vector<Student*> studentList;

            void addStudent(Student*);

            json asJSON();

            void storeClassroom();
            void displayClassroom();

        // public :
            
    };


#endif // !CLASSROOM_H