app.service("footballService", ["$http", function ($http) {
    this.getAllClubs = function () {
        return $http.get("http://localhost:8080/getAllClubs");
    };

    this.deleteClub = function (clubId) {
        return $http.delete("http://localhost:8080/deleteClub/" + clubId);
    };

    this.addClub = function (club) {
        return $http.post("http://localhost:8080/addClub", club);
    };

    this.getAllFootballers = function () {
        return $http.get("http://localhost:8080/getAllFootballers");
    };

    this.deleteFootballer = function (footballerId) {
        return $http.delete("http://localhost:8080/deleteFootballer/" + footballerId);
    };

    this.addFootballer = function (footballer) {
        return $http.post("http://localhost:8080/addFootballer", footballer);
    };

    this.showFootballerSkills = function (footballerId) {
        return $http.get("http://localhost:8080/showFootballerSkills/" + footballerId);
    };

    this.updateSkill = function (skillObject) {
        return $http.post("http://localhost:8080/updateSkill", skillObject);
    };

    this.getAllCountry = function () {
        return $http.get("http://localhost:8080/getAllCountry");
    };

    this.getAllAcademy = function () {
        return $http.get("http://localhost:8080/getAllAcademy");
    };

    this.makeContract = function (contractObject) {
        return $http.post("http://localhost:8080/makeContract", contractObject);
    };

    this.getAllManagers = function () {
        return $http.get("http://localhost:8080/getAllManagers");
    };

    this.addManager = function (managerObject) {
        return $http.post("http://localhost:8080/addNewManager", managerObject);
    };

}]);