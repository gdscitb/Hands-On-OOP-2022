#ifndef STUDENT_H
#define STUDENT_H

#include "User.h"

    enum Major {
            art,
            literature,
            medical
        };

    class Student : public User {
        protected :
            Major studentMajor;
        
            int citizenshipScore;
            int religionScore;
            int environmentalScore;

        public :
            // virtual json asJSON() = 0;

            Student(int, string, Major);

    };

    class ArtStudent : public Student {
        private :
            int artScore;

        public :
            json asJSON();
    };

    class LiteratureStudent : public Student {
        private :
            int literatureScore;

        public :
            json asJSON();
    };

    class MedicalStudent : public Student {
        private :
            int medicalScore;

        public :
            json asJSON();
    };

#endif // !STUDENT_H