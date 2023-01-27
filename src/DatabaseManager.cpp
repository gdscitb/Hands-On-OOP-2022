#include "DatabaseManager.h"

void DatabaseManager::addClassroom(Classroom classroom){
    classroomList.push_back(classroom);
}

Classroom DatabaseManager::getClassroom(int id = 0){
    return classroomList[id];
}

void DatabaseManager::StoreData(){
    ofstream JSONFile("src/data.json");
    json data;
    //  = json::parse(JSONFile);

    for (auto i:classroomList){
        data.push_back(i.asJSON());
    }

    JSONFile << data.dump();

    JSONFile.close();
}

void DatabaseManager::LoadData(){
    classroomList.clear();
    
    ifstream JSONFile("src/data.json");
    json data = json::parse(JSONFile);

    // cout <<endl << endl << data.dump() << data[0]["classID"] << endl << endl;
    

    for(auto i:data){
        // cout << "weya" << i["classID"] << i["teacher"]["identifier"]["id"] << i["teacher"]["identifier"]["name"]<< endl;
        classroomList.push_back(Classroom(i["classID"], Teacher(i["teacher"]["identifier"]["id"], i["teacher"]["identifier"]["name"])));
    }

    int __count = 0;
    for(auto i:data){
        for(auto j:i["students"]){
            if(j["identifier"]["major"] == "art")
                classroomList[__count].addStudent(new ArtStudent(j["identifier"]["id"], j["identifier"]["name"], j["scores"]["citizenship"], j["scores"]["environmental"], j["scores"]["religion"], j["scores"]["majorCourse"]));
            else if (j["identifier"]["major"] == "literature")
                classroomList[__count].addStudent(new LiteratureStudent(j["identifier"]["id"], j["identifier"]["name"], j["scores"]["citizenship"], j["scores"]["environmental"], j["scores"]["religion"], j["scores"]["majorCourse"]));
            else if (j["identifier"]["major"] == "medical")
                classroomList[__count].addStudent(new MedicalStudent(j["identifier"]["id"], j["identifier"]["name"], j["scores"]["citizenship"], j["scores"]["environmental"], j["scores"]["religion"], j["scores"]["majorCourse"]));
        }
        __count++;
    }
}

void DatabaseManager::ClearData(){
    classroomList.clear();
}

void DatabaseManager::displayDatabase(){
    for(auto i:classroomList){
        i.displayClassroom();
    }
}