#include "Student.h"



ArtStudent::ArtStudent(int myid, string myName){
    id = myid;
    name = myName;
    studentMajor = art;

    citizenshipScore = religionScore = environmentalScore = artScore = 0;
}

json Student::asJSON(){
    json data;

    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;

    return data;
};

json ArtStudent::asJSON(){
    json data;

    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;

    data["scores"]["citizenship"] = citizenshipScore;
    data["scores"]["religion"] = religionScore;
    data["scores"]["environmental"] = environmentalScore;

    data["scores"]["art"] = artScore;

    return data;
}

json LiteratureStudent::asJSON(){
    json data;

    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;

    data["scores"]["citizenship"] = citizenshipScore;
    data["scores"]["religion"] = religionScore;
    data["scores"]["environmental"] = environmentalScore;

    data["scores"]["literature"] = literatureScore;

    return data;
}

json MedicalStudent::asJSON(){
    json data;

    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;

    data["scores"]["citizenship"] = citizenshipScore;
    data["scores"]["religion"] = religionScore;
    data["scores"]["environmental"] = environmentalScore;

    data["scores"]["medical"] = medicalScore;

    return data;
}