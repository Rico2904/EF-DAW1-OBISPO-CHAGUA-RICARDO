package pe.edu.cibertec.EF_Obispo_Ricardo_DAW1.service;

import pe.edu.cibertec.EF_Obispo_Ricardo_DAW1.dto.CarDetailDto;
import pe.edu.cibertec.EF_Obispo_Ricardo_DAW1.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {

    List<CarDto> getAllCars() throws Exception;

    Optional<CarDto> getAllCarsById(int carId) throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarDetailDto carDetailDto) throws Exception;


}
