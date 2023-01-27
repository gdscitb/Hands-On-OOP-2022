#ifndef STUDENT_H
#define STUDENT_H

#include "User.h"
// #include "randint.h"

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
            virtual json asJSON() = 0;
            virtual int getMajorCourseScore() = 0;

            string getStudentMajor();

            int getCitizenshipScore();
            int getReligionScore();
            int getEnvironmentalScore();

            
            

    };

    class ArtStudent : public Student {
        private :
            int artScore;

        public :
            ArtStudent(string, int, int, int, int);
            ArtStudent(int, string, int, int, int, int);

            // int getArtScore();

            int getMajorCourseScore();

            json asJSON();
    };

    class LiteratureStudent : public Student {
        private :
            int literatureScore;

        public :
            LiteratureStudent(string, int, int, int, int);
            LiteratureStudent(int, string, int, int, int, int);

            // int getLiteratureScore();

            int getMajorCourseScore();

            json asJSON();
    };

    class MedicalStudent : public Student {
        private :
            int medicalScore;

        public :
            MedicalStudent(string, int, int, int, int);
            MedicalStudent(int, string, int, int, int, int);

            // int getMedicalScore();

            int getMajorCourseScore();

            json asJSON();
    };

#endif // !STUDENT_H