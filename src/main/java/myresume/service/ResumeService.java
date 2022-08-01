package myresume.service;

import myresume.common.IdNotFoundException;
import myresume.model.Resume;
import myresume.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ResumeService {
    @Autowired
    private ResumeRepository resumeRepository;

    public Resume saveDetails(){

            Resume resume = new Resume();
            resume.setResume_id(1);
            resume.setName("Balaji");
            resume.setLanguages("1.Tamil,2.English");
            resume.setEducation("B.E-C.S.E-Sri Eshwar collge of Engineering");
            resume.setSkills("1.C,2.JAVA,3.HTML");
            resume.setYears_of_experience("3 Years of Experience as an FullStackDeveloper in XYZ Company");
            resume.setEmail_id("balajibala10203@gmail.com");
            resume.setAddress("Udt");
            resume.setPhone_number("7598703771");
            return resumeRepository.save(resume);

    }
    public List<Resume> view(){
        return (List<Resume>) resumeRepository.findAll();
    }
    public Resume getById(Integer id,Resume resume) throws IdNotFoundException {
       return resumeRepository.findById(id).orElseThrow(()-> new IdNotFoundException("PersonalDetails does exists with the id:"+id));
    }

    public Resume edit(Integer id,Resume resume) throws IdNotFoundException {
        Resume resume1 =resumeRepository.findById(id).orElseThrow(()-> new IdNotFoundException("PersonalDetails does exists with the id:"+id));
        resume1.setPhone_number(resume.getPhone_number());
        resume1.setEmail_id(resume.getEmail_id());
        resume1.setAddress(resume.getAddress());
        return resumeRepository.save(resume1);
    }
}
