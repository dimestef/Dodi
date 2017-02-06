app.controller("footballController", ["$scope", "$http", "footballService", function ($scope, $http, footballService){
    $scope.example = "Good job!";
    $scope.selectedProduct = "";
    $scope.clubs = [];
    $scope.clubFlag = true;
    $scope.footballers = [];
    $scope.footballerFlag = false;
    $scope.skills = {};
    $scope.skill = 80;
    $scope.skillFlag = false;
    $scope.skillFootballer = "";
    $scope.skillObject = {};

    $scope.change = function (str) {
        if(str == "club"){
            $scope.clubFlag = true;
            $scope.footballerFlag = false;
            $scope.skillFlag = false;
        }else if(str == "footballer"){
            $scope.footballerFlag = true;
            $scope.clubFlag = false;
            $scope.skillFlag = false;
        }else{
            $scope.skillFlag = true;
            $scope.clubFlag = false;
            $scope.footballerFlag = false;
        }
    }

    $scope.getAllClubs = function () {
        footballService.getAllClubs()
            .then(function (response) {
                $scope.clubs = response.data;
            }, function (error) {
                console.log(error);
            });
    }

    $scope.deleteClub = function (clubId) {
        footballService.deleteClub(clubId)
            .then(function (response) {
                console.log(response);
            }, function (error) {
                console.log(error);
            });
    }

    $scope.getAllFootballers = function () {
        footballService.getAllFootballers()
            .then(function (response) {
                $scope.footballers = response.data;
            }, function (error) {
                console.log(error);
            });
    }

    $scope.deleteFootballer = function (footballerId) {
        footballService.deleteFootballer(footballerId)
            .then(function (response) {
                console.log(response);
            }, function (error) {
                console.log(error);
            });
    }

    $scope.showFootballerSkills = function (footballerId, fistName, lastName) {
        $scope.skillFootballer = fistName + " " + lastName;
        footballService.showFootballerSkills(footballerId)
            .then(function (response) {
                $scope.skills = response.data;
            }, function (error) {
                console.log(error);
            });
    }

    $scope.updateSkill = function (skillObject) {
        footballService.updateSkill(skillObject)
            .then(function (response) {
                console.log(response);
            }, function (error) {
                console.log(error);
            });
    }

}]);