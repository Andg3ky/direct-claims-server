package com.allstate.directclaimsserver.service;

import com.allstate.directclaimsserver.data.ClaimsRepository;
import com.allstate.directclaimsserver.domain.ClaimsTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Service
public class BootstrapService {

    @Autowired
    ClaimsRepository claimsRepository;

    @PostConstruct
    public void initializeDate() {

       if (claimsRepository.findAll().size() ==0) {

            ClaimsTransaction claim1 = new ClaimsTransaction(null, "923880431", "Mr Alan James", "Awaiting Assessment",
                    "Property", "1 Main Road", 450, LocalDate.now(), "Window Smashed", "Football hit the window","same as address", "Not Applicable","Not Applicable",
                    0,"Not Applicable","Not Applicable");
            ClaimsTransaction claim2 = new ClaimsTransaction(null, "973621146", "Miss Daisy Harrison", "Rejected",
                    "Motor", "29 Grove Hill", 270, LocalDate.now(), "Car Backed Into", "Occurred at Traffic Lights","Not Applicable", "Ford", "Focus",
                    2008, "Not Applicable", "Not Applicable");
            ClaimsTransaction claim3 = new ClaimsTransaction(null, "900632137", "Mr James Willis", "In Progress",
                    "Pet", "15 Green Lane", 100, LocalDate.now(), "Pet Dental Work", "Dog gum decay required addressing","Not Applicable", "Not Applicable", "Not Applicable",
                    0, "Dog", "Terrior");
            ClaimsTransaction claim4 = new ClaimsTransaction(null, "912989853", "Mrs Samantha Burton", "Rejected",
                    "Motor", "60 Burns Gardens", 499, LocalDate.now(), "Car Door Vandalised", "Spray Painted in Carpark","Not Applicable", "Honda", "Accord",
                    2018, "Not Applicable", "Not Applicable");
            ClaimsTransaction claim5 = new ClaimsTransaction(null, "934324234", "Mr John Smith", "Awaiting Assessment",
                    "Pet", "5 Main Street", 350, LocalDate.now(), "Pet Leg Injury", "Cat hurt while jumping over fence","Not Applicable", "Not Applicable", "Not Applicable",
                    0,"Cat","Persian");
            ClaimsTransaction claim6 = new ClaimsTransaction(null, "923444656", "Mrs Talia Johnson", "Accepted and Paid",
                    "Property", "40 Mayfair Park", 50, LocalDate.now(), "Roof Slates Fallen","During stormy weather","same as address","Not Applicable","Not Applicable",
                    0,"Not Applicable","Not Applicable");
            ClaimsTransaction claim7 = new ClaimsTransaction(null, "980380734", "Mr Mike Cole", "Accepted and Paid",
                    "Property", "50 Warren Drive", 150, LocalDate.now(), "Water Damage","Loose Brickwork During Rainy Weather","1 Beach Lane","Not Applicable","Not Applicable",
                    0,"Not Applicable","Not Applicable");
            ClaimsTransaction claim8 = new ClaimsTransaction(null, "924343889", "Mrs Jane Bailey", "Transferred to Main Claims",
                    "Pet", "18 Parker Avenue", 190, LocalDate.now(), "Pet Illness", "Stomach Infection","Not Applicable", "Not Applicable","Not Applicable",
                    0,"Cat","Sphynx");
            ClaimsTransaction claim9 = new ClaimsTransaction(null, "975260750", "Mr Grant Stewart", "Accepted and Paid",
                    "Motor", "20 Morrison Lane", 350, LocalDate.now(), "Electrical Fault", "Transaction Control Failed","Not Applicable", "Porsche", "911",
                    2017, "Not Applicable", "Not Applicable");
            ClaimsTransaction claim10 = new ClaimsTransaction(null, "977308734", "Miss Libby Graham", "In Progress",
                    "Motor", "61 Beverley Roads", 90, LocalDate.now(), "Mirrors Broken", "Backing into Garage","Not Applicable", "Peugeot", "208",
                    2013, "Not Applicable", "Not Applicable");
           ClaimsTransaction claim11 = new ClaimsTransaction(null, "950660521", "Mr Joe Marshall", "Accepted and Paid",
                   "Pet", "99 Greenland Drive", 40, LocalDate.now(), "Medication Purchased Online", "Quinolones were given to rabbit","Not Applicable", "Not Applicable","Not Applicable",
                   0,"Rabbit","Holland Lop");
           ClaimsTransaction claim12 = new ClaimsTransaction(null, "977308734", "Mr Darren McMahon", "Rejected",
                   "Property", "31 Eden Gardens", 480, LocalDate.now(), "Flooding", "Sink Pipes Burst","9 Rugby Drive", "Not Applicable","Not Applicable",
                   0,"Not Applicable","Not Applicable");
           ClaimsTransaction claim13 = new ClaimsTransaction(null, "888923957", "Mrs Sharon Little", "In Progress",
                   "Pet", "68 Watering Heights", 200, LocalDate.now(), "Personal Accident", "Hit by Car","Not Applicable", "Not Applicable","Not Applicable",
                   0,"Not Applicable","Not Applicable");
           ClaimsTransaction claim14 = new ClaimsTransaction(null, "852346887", "Mrs Courtney Murdock", "Transferred to Main Claims",
                   "Motor", "2 Ann Street", 400, LocalDate.now(), "Transmission Fault", "Gearbox failed to operate","Not Applicable", "Renault", "Clio",
                   2016,"Not Applicable","Not Applicable");
           ClaimsTransaction claim15 = new ClaimsTransaction(null, "852884192", "Mr Matthew Harris", "Awaiting Assessment",
                   "Property", "15 Greys Hill", 450, LocalDate.now(), "Plumbing work required", "Toilet was blocked","same as address", "Not Applicable","Not Applicable",
                   0,"Not Applicable","Not Applicable");
           ClaimsTransaction claim16 = new ClaimsTransaction(null, "859432591", "Mr Mike Franklin", "In Progress",
                   "Pet", "42 Carlton Road", 274, LocalDate.now(), "Vet Fees", "Vaccine and Cleaning were provided","Not Applicable", "Not Applicable","Not Applicable",
                   0,"Dog","Poodle");
           ClaimsTransaction claim17 = new ClaimsTransaction(null, "997834897", "Miss Holly Smith", "Awaiting Payment",
                   "Property", "49 Albany Avenue", 300, LocalDate.now(), "Broken Down Boiler", "Fuses went","same as address", "Not Applicable","Not Applicable",
                   0,"Not Applicable","Not Applicable");
           ClaimsTransaction claim18 = new ClaimsTransaction(null, "873344902", "Mr Max Boyle", "Rejected",
                   "Motor", "57 Ward Heights", 40, LocalDate.now(), "Wheel Alignment", "Uneven balance in the car while driving","Not Applicable", "Vauxhall", "Corsa",
                   2007, "Not Applicable", "Not Applicable");
           ClaimsTransaction claim19 = new ClaimsTransaction(null, "873452343", "Mrs Tanya Garcia", "Awaiting Payment",
                   "Motor", "35 Uplands Park", 110, LocalDate.now(), "Headlights & Tail lights", "Visibility was poor","Not Applicable",  "Jaguar", "XJ220",
                   2022, "Not Applicable", "Not Applicable");
           ClaimsTransaction claim20 = new ClaimsTransaction(null, "893285766", "Miss Pauline Daniels", "In Progress",
                   "Property", "8 Robinson Street", 345, LocalDate.now(), "Cracked Floor", "Wear and Tear","17 Sandymount Court", "Not Applicable","Not Applicable",
                   0,"Not Applicable","Not Applicable");

            claimsRepository.save(claim1);
            claimsRepository.save(claim2);
            claimsRepository.save(claim3);
            claimsRepository.save(claim4);
            claimsRepository.save(claim5);
            claimsRepository.save(claim6);
            claimsRepository.save(claim7);
            claimsRepository.save(claim8);
            claimsRepository.save(claim9);
            claimsRepository.save(claim10);
            claimsRepository.save(claim11);
            claimsRepository.save(claim12);
            claimsRepository.save(claim13);
            claimsRepository.save(claim14);
            claimsRepository.save(claim15);
            claimsRepository.save(claim16);
            claimsRepository.save(claim17);
            claimsRepository.save(claim18);
            claimsRepository.save(claim19);
            claimsRepository.save(claim20);

        }
    }
}
