interface IFly {
    fly (speed:number):void;
    land ():boolean;

}

class Airplane implements IFly{
    pilotName:String;
    flightCompanyName:String;
    destination:String;

    fly(speed:number){
        console.log("The Airplane is flying at "+speed+" Km/h")
    }

    land (){
        console.log ("The Airplane has landed")
        return true;
    }

}

class Kite implements IFly{
    color:String;
    price:Number;

    fly(speed:number){
        console.log("The Kite is flying at "+speed+" Km/h")
    }
  
    land (){
        console.log ("The Kite has landed");
        return true;
    }

}

class Bird implements IFly{
    type:String;
    age:Number;
    color:String;

    fly(speed:number){
        console.log("The Bird is flying at "+speed+" Km/h")
    }
 
    land (){
        console.log ("The Bird has landed");
        return true;
    }

}

function createIFly () : IFly {
    var num:number=Math.floor(Math.random()*3);
    
    switch (num){
        case 0 :{
        return new Bird;
        break;
        }

        case 1 :{
        return new Airplane;
        break;
        }

        case 2 :{
        return new Kite;
        break;
        }

        default:
        console.log("This is the default case");
        return null;
    }
    
}

let iFlyArray : IFly[]= new Array<IFly>(10);
for (var i = 0; i < iFlyArray.length; i++){
    iFlyArray[i]=createIFly();
    console.log("creating Ifly number: "+i);
}

for (var i = 0; i < iFlyArray.length; i++){
    iFlyArray[i].fly(10);
    iFlyArray[i].land();
}
