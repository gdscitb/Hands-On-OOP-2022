#ifndef STUDENT_H
#define STUDENT_H

#include "User.h"

    enum Major {
            art,
            literature,
            medical
        };

    class Student : public User {
        public :
            Major studentMajor;
        
            int citizenshipScore;
            int religionScore;
            int environmentalScore;

        // public :
            virtual json asJSON() = 0;

            // Student(int, string);

    };

    class ArtStudent : public Student {
        private :
            int artScore;

        public :
            ArtStudent(int, string);

            json asJSON();
    };

    class LiteratureStudent : public Student {
        private :
            int literatureScore;

        public :
            LiteratureStudent(int, string);

            json asJSON();
    };

    class MedicalStudent : public Student {
        private :
            int medicalScore;

        public :
            MedicalStudent(int, string);
            json asJSON();
    };

#endif // !STUDENT_H