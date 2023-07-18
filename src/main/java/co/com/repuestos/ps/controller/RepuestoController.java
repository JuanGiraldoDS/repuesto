package co.com.repuestos.ps.controller;

import co.com.repuestos.ps.dto.ResponseErrorDTO;
import co.com.repuestos.ps.modelo.Repuestos;

import co.com.repuestos.ps.services.IRepuestoServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/repuestos")
public class RepuestoController {

    @Autowired
    IRepuestoServices iRepuestoServices;

    private static final Logger logger = LoggerFactory.getLogger(RepuestoController.class);


    @GetMapping("/v1/{id}")
    public ResponseEntity<?> getRepuesto(@PathVariable("id") long id){
        try {
            Repuestos resultado= iRepuestoServices.consultar(id);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(resultado);
        } catch (Exception e) {
            logger.error(e.getMessage());
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    new ResponseErrorDTO(
                            HttpStatus.BAD_REQUEST.toString(),
                            e.getCause() + "",
                            e.getMessage()));
        }


    }

    @PostMapping("/v1")
    public ResponseEntity<?> saveRepuestos(@RequestBody Repuestos repuestos){
        try {
            Repuestos resultado= iRepuestoServices.guardar(repuestos);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(resultado);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseErrorDTO(HttpStatus.BAD_REQUEST.toString(), e.getCause() + "", e.getMessage()));
        }
    }



    @PutMapping("/v1")
    public ResponseEntity<?> updateRepuesto(@RequestBody Repuestos repuestos){
        try {
            Repuestos resultado= iRepuestoServices.actualizar(repuestos);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(resultado);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseErrorDTO(HttpStatus.BAD_REQUEST.toString(), e.getCause() + "", e.getMessage()));
        }
    }
    @DeleteMapping("/v1")
    public ResponseEntity<?> deleteRepuesto(@PathVariable long id){
        try {
            Repuestos resultado= iRepuestoServices.borrar(id);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(resultado);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseErrorDTO(HttpStatus.BAD_REQUEST.toString(), e.getCause() + "", e.getMessage()));
        }
    }



}

