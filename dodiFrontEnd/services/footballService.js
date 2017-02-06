app.service("footballService", ["$http", function ($http) {
    this.getAllClubs = function () {
        return $http.get("http://localhost:8080/getAllClubs");
    };

    this.deleteClub = function (clubId) {
        return $http.delete("http://localhost:8080/deleteClub/" + clubId);
    };

    this.getAllFootballers = function () {
        return $http.get("http://localhost:8080/getAllFootballers");
    };

    this.deleteFootballer = function (footballerId) {
        return $http.delete("http://localhost:8080/deleteFootballer/" + footballerId);
    };

    this.showFootballerSkills = function (footballerId) {
        return $http.get("http://localhost:8080/showFootballerSkills/" + footballerId);
    };

    this.updateSkill = function (skillObject) {
        return $http.post("http://localhost:8080/updateSkill", skillObject);
    };
}]);