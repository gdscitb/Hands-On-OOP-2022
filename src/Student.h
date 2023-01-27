#ifndef STUDENT_H
#define STUDENT_H

#include <string>

    using namespace std;

    enum Major {
            art,
            literature,
            medical
        };

    class Student {
        private :
            int studentID;
            string studentName;
            Major studentMajor;
        
            int citizenshipScore;
            int religionScore;
            int environmentalScore;
    };

#endif // !STUDENT_H