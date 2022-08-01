package myresume.controller;

import myresume.common.IdNotFoundException;
import myresume.model.Resume;
import myresume.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(allowedHeaders = "*",origins = "*")
@RestController
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @GetMapping("/save")
    public Resume save(){
        return resumeService.saveDetails();
    }
    @GetMapping("/view")
    public List<Resume> view(){
        return resumeService.view();
    }
    @GetMapping("/view/{id}")
    public Resume getById(@PathVariable Integer id,@RequestBody Resume resume) throws IdNotFoundException {
        return resumeService.getById(id, resume);
    }
    @PutMapping("/edit/{id}")
    public Resume edit(@PathVariable Integer id, @RequestBody Resume resume) throws IdNotFoundException {
       return resumeService.edit(id, resume);
    }
}
