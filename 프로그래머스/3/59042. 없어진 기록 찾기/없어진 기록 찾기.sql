
SELECT O.Animal_Id,  O.Name
From ANIMAL_OUTS O
Left Outer Join ANIMAL_INS I
On o.Animal_Id = I.Animal_Id
Where I.Animal_Id is Null
Order by O.Animal_Id