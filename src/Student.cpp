#include "Student.h"

json ArtStudent::asJSON(){
    json data;

    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;

    data["scores"]["citizenship"] = citizenshipScore;
    data["scores"]["religion"] = religionScore;
    data["scores"]["environmental"] = environmentalScore;

    data["scores"]["art"] = artScore;
}

json LiteratureStudent::asJSON(){
    json data;

    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;

    data["scores"]["citizenship"] = citizenshipScore;
    data["scores"]["religion"] = religionScore;
    data["scores"]["environmental"] = environmentalScore;

    data["scores"]["literature"] = literatureScore;
}

json MedicalStudent::asJSON(){
    json data;

    data["identifier"]["id"] = id;
    data["identifier"]["name"] = name;

    data["scores"]["citizenship"] = citizenshipScore;
    data["scores"]["religion"] = religionScore;
    data["scores"]["environmental"] = environmentalScore;

    data["scores"]["medical"] = medicalScore;
}