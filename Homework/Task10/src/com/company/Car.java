package com.company;

/**
 * Created by Дмитрий on 21.10.2017.
 */

/*Модификация (двигатель)
Количество дверей
Мощность (л.с.)
Тип кузова
Количество мест
Начало выпуска
Оконч. выпуска
Класс автомобиля
Цвет кузова
Модель турбины (если есть)
Размер дисков
Модель дисков
Цвет салона
Тип отделки салона
Тип привода
Аудио система
Степень сжатия
Выброс CO2
Тип подвески
*/
public class Car {
  private  String modificationEngine;
  private int  numberOfDoors;
  private double  powerHp;
  private String bodyType;
  private int numberOfSeats;
  private int  startOfRelease;
  private int  theEndOutputOf;
  private String  vehicleClass;
  private String  bodyColor;
  private String  theTurbineModel;
  private double  sizeOfDisks;
  private String  modelOfDisks;
  private String  interiorColor;
  private String  typeOfInteriorTrim;
  private String  typeOfDrive;
  private String  audioSystem;
  private double   compressionRatio;
  private double  cO2Emissions;
  private String   suspensionType;

  private Car(BuilderCar builderCar){
      this.audioSystem = builderCar.audioSystem;
      this.bodyColor = builderCar.bodyColor;
      this.bodyType = builderCar.bodyType;
      this.cO2Emissions = builderCar.cO2Emissions;
      this.compressionRatio = builderCar.compressionRatio;
      this.interiorColor = builderCar.interiorColor;
      this.modelOfDisks = builderCar.modelOfDisks;
      this.modificationEngine = builderCar.modificationEngine;
      this.numberOfDoors = builderCar.numberOfDoors;
      this.powerHp = builderCar.powerHp;
      this.numberOfSeats = builderCar.numberOfSeats;
      this.startOfRelease = builderCar.startOfRelease;
      this.theEndOutputOf = builderCar.theEndOutputOf;
      this.vehicleClass = builderCar.vehicleClass;
      this.theTurbineModel = builderCar.theTurbineModel;
      this.sizeOfDisks = builderCar.sizeOfDisks;
      this.typeOfInteriorTrim = builderCar.typeOfInteriorTrim;
      this.typeOfDrive = builderCar.typeOfDrive;
      this.suspensionType = builderCar.suspensionType;

  }
  public static class BuilderCar{
      private  String modificationEngine;
      private int  numberOfDoors;
      private double  powerHp;
      private String bodyType;
      private int numberOfSeats;
      private int  startOfRelease;
      private int  theEndOutputOf;
      private String  vehicleClass;
      private String  bodyColor;
      private String  theTurbineModel;
      private double  sizeOfDisks;
      private String  modelOfDisks;
      private String  interiorColor;
      private String  typeOfInteriorTrim;
      private String  typeOfDrive;
      private String  audioSystem;
      private double   compressionRatio;
      private double  cO2Emissions;
      private String   suspensionType;

      public BuilderCar modificationEngine(String modificationEngine){
          this.modificationEngine = modificationEngine;
          return this;
      } public BuilderCar numberOfDoors(int numberOfDoors){
          this.numberOfDoors = numberOfDoors;
          return this;
      } public BuilderCar powerHp(double powerHp){
          this.powerHp = powerHp;
          return this;
      } public BuilderCar bodyType(String bodyType){
          this.bodyType = bodyType;
          return this;
      } public BuilderCar numberOfSeats(int numberOfSeats){
          this.numberOfSeats = numberOfSeats;
          return this;
      } public BuilderCar startOfRelease(int startOfRelease){
          this.startOfRelease = startOfRelease;
          return this;
      } public BuilderCar theEndOutputOf(int theEndOutputOf){
          this.theEndOutputOf = theEndOutputOf;
          return this;
      } public BuilderCar vehicleClass(String vehicleClass){
          this.vehicleClass = vehicleClass;
          return this;
      } public BuilderCar bodyColor(String bodyColor){
          this.bodyColor = bodyColor;
          return this;
      }public BuilderCar theTurbineModel(String theTurbineModel){
          this.theTurbineModel = theTurbineModel;
          return this;
      }public BuilderCar sizeOfDisks(double sizeOfDisks){
          this.sizeOfDisks = sizeOfDisks;
          return this;
      }public BuilderCar modelOfDisks(String modelOfDisks){
          this.modelOfDisks = modelOfDisks;
          return this;
      }public BuilderCar interiorColor(String interiorColor){
          this.interiorColor = interiorColor;
          return this;
      }public BuilderCar typeOfInteriorTrim(String typeOfInteriorTrim){
          this.typeOfInteriorTrim = typeOfInteriorTrim;
          return this;
      }public BuilderCar typeOfDrive(String typeOfDrive){
          this.typeOfDrive = typeOfDrive;
          return this;
      }public BuilderCar audioSystem(String audioSystem){
          this.audioSystem = audioSystem;
          return this;
      }public BuilderCar compressionRatio(double compressionRatio){
          this.compressionRatio = compressionRatio;
          return this;
      }public BuilderCar cO2Emissions(double cO2Emissions){
          this.cO2Emissions = cO2Emissions;
          return this;
      }public BuilderCar suspensionType(String suspensionType){
          this.suspensionType = suspensionType;
          return this;
      }
        public Car buildCar(){
          return new Car(this);
        }
  }
  public static BuilderCar builderCar(){
      return new BuilderCar();
  }

    public String getModificationEngine() {
        return modificationEngine;
    }

    public void setModificationEngine(String modificationEngine) {
        this.modificationEngine = modificationEngine;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public double getPowerHp() {
        return powerHp;
    }

    public void setPowerHp(double powerHp) {
        this.powerHp = powerHp;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getStartOfRelease() {
        return startOfRelease;
    }

    public void setStartOfRelease(int startOfRelease) {
        this.startOfRelease = startOfRelease;
    }

    public int getTheEndOutputOf() {
        return theEndOutputOf;
    }

    public void setTheEndOutputOf(int theEndOutputOf) {
        this.theEndOutputOf = theEndOutputOf;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getTheTurbineModel() {
        return theTurbineModel;
    }

    public void setTheTurbineModel(String theTurbineModel) {
        this.theTurbineModel = theTurbineModel;
    }

    public double getSizeOfDisks() {
        return sizeOfDisks;
    }

    public void setSizeOfDisks(double sizeOfDisks) {
        this.sizeOfDisks = sizeOfDisks;
    }

    public String getModelOfDisks() {
        return modelOfDisks;
    }

    public void setModelOfDisks(String modelOfDisks) {
        this.modelOfDisks = modelOfDisks;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public String getTypeOfInteriorTrim() {
        return typeOfInteriorTrim;
    }

    public void setTypeOfInteriorTrim(String typeOfInteriorTrim) {
        this.typeOfInteriorTrim = typeOfInteriorTrim;
    }

    public String getTypeOfDrive() {
        return typeOfDrive;
    }

    public void setTypeOfDrive(String typeOfDrive) {
        this.typeOfDrive = typeOfDrive;
    }

    public String getAudioSystem() {
        return audioSystem;
    }

    public void setAudioSystem(String audioSystem) {
        this.audioSystem = audioSystem;
    }

    public double getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(double compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    public double getcO2Emissions() {
        return cO2Emissions;
    }

    public void setcO2Emissions(double cO2Emissions) {
        this.cO2Emissions = cO2Emissions;
    }

    public String getSuspensionType() {
        return suspensionType;
    }

    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modificationEngine='" + modificationEngine + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", powerHp=" + powerHp +
                ", bodyType='" + bodyType + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", startOfRelease=" + startOfRelease +
                ", theEndOutputOf=" + theEndOutputOf +
                ", vehicleClass='" + vehicleClass + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", theTurbineModel='" + theTurbineModel + '\'' +
                ", sizeOfDisks=" + sizeOfDisks +
                ", modelOfDisks='" + modelOfDisks + '\'' +
                ", interiorColor='" + interiorColor + '\'' +
                ", typeOfInteriorTrim='" + typeOfInteriorTrim + '\'' +
                ", typeOfDrive='" + typeOfDrive + '\'' +
                ", audioSystem='" + audioSystem + '\'' +
                ", compressionRatio=" + compressionRatio +
                ", cO2Emissions=" + cO2Emissions +
                ", suspensionType='" + suspensionType + '\'' +
                '}';
    }
}
