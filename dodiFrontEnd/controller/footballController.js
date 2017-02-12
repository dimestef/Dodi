app.controller("footballController", ["$scope", "$http", "footballService", function ($scope, $http, footballService){
    $scope.example = "Good job!";
    $scope.selectedProduct = "";
    $scope.clubObject = {};
    $scope.clubs = [];
    $scope.clubFlag = true;
    $scope.footballerObject = {};
    $scope.footballers = [];
    $scope.footballerFlag = false;
    $scope.skillObject = {};
    $scope.skills = {};
    $scope.skill = 80;
    $scope.skillFlag = false;
    $scope.skillFootballer = "";
    $scope.skillObject = {};
    $scope.selectedFootballer = {};
    $scope.addFootballerFlag = false;
    $scope.addClubFlag = false;
    $scope.countries = [];
    $scope.academies = [];
    $scope.contractObject = {};
    $scope.makeContractFlag = false;
    $scope.managers = [];
    $scope.clubManagerFlag = false;
    $scope.managerObject = {};
    $scope.addNewManagerFlag = false;


    $scope.addClub = function (cObject) {
        footballService.addClub(cObject)
            .then(function (response) {
                console.log(response.data);
            }, function (error) {
                console.log(error);
            });
    }

    $scope.addFootballer = function (fObject, sObject) {
        fObject.skill = sObject;
        footballService.addFootballer(fObject)
            .then(function (response) {
                console.log(response.data);
            }, function (error) {
                console.log(error);
            });
    }

    $scope.change = function (str) {
        if(str == "club"){
            $scope.clubFlag = true;
            $scope.footballerFlag = false;
            $scope.skillFlag = false;
            $scope.addClubFlag = false;
            $scope.addFootballerFlag = false;
            $scope.makeContractFlag = false;
            $scope.clubManagerFlag = false;
            $scope.addNewManagerFlag = false;
        }else if(str == "footballer"){
            $scope.footballerFlag = true;
            $scope.clubFlag = false;
            $scope.skillFlag = false;
            $scope.addClubFlag = false;
            $scope.addFootballerFlag = false;
            $scope.makeContractFlag = false;
            $scope.clubManagerFlag = false;
            $scope.addNewManagerFlag = false;
        }else if(str == "addClub"){
            $scope.addClubFlag = true;
            $scope.clubFlag = false;
            $scope.skillFlag = false;
            $scope.footballerFlag = false;
            $scope.addFootballerFlag = false;
            $scope.makeContractFlag = false;
            $scope.clubManagerFlag = false;
            $scope.addNewManagerFlag = false;
        }else if(str == "addFootballer"){
            $scope.addFootballerFlag = true;
            $scope.addClubFlag = false;
            $scope.clubFlag = false;
            $scope.skillFlag = false;
            $scope.footballerFlag = false;
            $scope.makeContractFlag = false;
            $scope.clubManagerFlag = false;
            $scope.addNewManagerFlag = false;
        }else if(str == "makeContract"){
            $scope.makeContractFlag = true;
            $scope.addFootballerFlag = false;
            $scope.addClubFlag = false;
            $scope.clubFlag = false;
            $scope.skillFlag = false;
            $scope.footballerFlag = false;
            $scope.clubManagerFlag = false;
            $scope.addNewManagerFlag = false;
        }else if(str == "clubManager"){
            $scope.clubManagerFlag = true;
            $scope.makeContractFlag = false;
            $scope.addFootballerFlag = false;
            $scope.addClubFlag = false;
            $scope.clubFlag = false;
            $scope.skillFlag = false;
            $scope.footballerFlag = false;
            $scope.addNewManagerFlag = false;
        }else if(str == "addNewManager"){
            $scope.addNewManagerFlag = true;
            $scope.clubManagerFlag = false;
            $scope.makeContractFlag = false;
            $scope.addFootballerFlag = false;
            $scope.addClubFlag = false;
            $scope.clubFlag = false;
            $scope.skillFlag = false;
            $scope.footballerFlag = false;
        }else{
            $scope.skillFlag = true;
            $scope.addNewManagerFlag = false;
            $scope.clubManagerFlag = false;
            $scope.makeContractFlag = false;
            $scope.addFootballerFlag = false;
            $scope.addClubFlag = false;
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
        $scope.selectedFootballer.footballerId = footballerId;
        $scope.selectedFootballer.fistName = lastName;
        $scope.selectedFootballer.fistName = lastName;

        $scope.skillFootballer = fistName + " " + lastName;
        footballService.showFootballerSkills(footballerId)
            .then(function (response) {
                $scope.skills = response.data;
            }, function (error) {
                console.log(error);
            });
    }

    $scope.updateSkill = function (skillObject) {
        skillObject.id = $scope.skills.id;
        footballService.updateSkill(skillObject)
            .then(function (response) {
                console.log(response);
                change('skill');
            }, function (error) {
                console.log(error);
            });
    }

    $scope.getAllCountry = function () {
        footballService.getAllCountry()
            .then(function (response) {
                $scope.countries = response.data;
            }, function (error) {
                console.log(error);
            });
    }

    $scope.getAllAcademy = function () {
        footballService.getAllAcademy()
            .then(function (response) {
                $scope.academies = response.data;
            }, function (error) {
                console.log(error);
            });
    }

    $scope.makeContract = function (contractObject) {
        footballService.makeContract(contractObject)
            .then(function (response) {
                console.log(response);
            }, function (error) {
                console.log(error);
            });
    }

    $scope.getAllManagers = function () {
        footballService.getAllManagers()
            .then(function (response) {
                $scope.managers = response.data;
            }, function (error) {
                console.log(error);
            });
    }

    $scope.addManager = function (managerObject) {
        footballService.addManager(managerObject)
            .then(function (response) {
                console.log(response);
            }, function (error) {
                console.log(error);
            });
    }
}]);