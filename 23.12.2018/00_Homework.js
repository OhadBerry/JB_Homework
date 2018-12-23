var Airplane = /** @class */ (function () {
    function Airplane() {
    }
    Airplane.prototype.fly = function (speed) {
        console.log("The Airplane is flying at " + speed + " Km/h");
    };
    Airplane.prototype.land = function () {
        console.log("The Airplane has landed");
        return true;
    };
    return Airplane;
}());
var Kite = /** @class */ (function () {
    function Kite() {
    }
    Kite.prototype.fly = function (speed) {
        console.log("The Kite is flying at " + speed + " Km/h");
    };
    Kite.prototype.land = function () {
        console.log("The Kite has landed");
        return true;
    };
    return Kite;
}());
var Bird = /** @class */ (function () {
    function Bird() {
    }
    Bird.prototype.fly = function (speed) {
        console.log("The Bird is flying at " + speed + " Km/h");
    };
    Bird.prototype.land = function () {
        console.log("The Bird has landed");
        return true;
    };
    return Bird;
}());
function createIFly() {
    var num = Math.floor(Math.random() * 3);
    switch (num) {
        case 0: {
            return new Bird;
            break;
        }
        case 1: {
            return new Airplane;
            break;
        }
        case 2: {
            return new Kite;
            break;
        }
        default:
            console.log("This is the default case");
            return null;
    }
}
var iFlyArray = new Array(10);
for (var i = 0; i < iFlyArray.length; i++) {
    iFlyArray[i] = createIFly();
    console.log("creating Ifly number: " + i);
}
for (var i = 0; i < iFlyArray.length; i++) {
    iFlyArray[i].fly(10);
    iFlyArray[i].land();
}
