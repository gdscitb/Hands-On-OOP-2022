#include "DatabaseManager.h"

void DatabaseManager::addClassroom(Classroom classroom){
    classroomList.push_back(classroom);
}

void DatabaseManager::StoreData(){
    json data;
    ofstream JSONFile("data.json");

    for (auto i:classroomList){
        data.push_back(i.asJSON());
    }

    JSONFile << data.dump();

    JSONFile.close();
}

void DatabaseManager::LoadData(){
    classroomList.clear();
    
    ifstream JSONFile("data.json");
    json data = json::parse(JSONFile);

    for(auto i:data){
        classroomList.push_back(Classroom(i["classID"], Teacher(i["teacher"]["identifier"]["id"], i["teacher"]["identifier"]["name"])));
    }

    int __count = 0;
    for(auto i:data){
        for(auto j:i["students"]){
            if(j["identifier"]["major"] == "art")
                classroomList[__count].addStudent(new ArtStudent(j["identifier"]["id"], j["identifier"]["name"], j["scores"]["citizenship"], j["scores"]["environmental"], j["scores"]["religion"], j["scores"]["art"]));
            else if (j["identifier"]["major"] == "literature")
                classroomList[__count].addStudent(new LiteratureStudent(j["identifier"]["id"], j["identifier"]["name"], j["scores"]["citizenship"], j["scores"]["environmental"], j["scores"]["religion"], j["scores"]["literature"]));
            else if (j["identifier"]["major"] == "medical")
                classroomList[__count].addStudent(new MedicalStudent(j["identifier"]["id"], j["identifier"]["name"], j["scores"]["citizenship"], j["scores"]["environmental"], j["scores"]["religion"], j["scores"]["medical"]));
        }
    }

    
}

void DatabaseManager::displayDatabase(){
    for(auto i:classroomList){
        i.displayClassroom();
    }
}