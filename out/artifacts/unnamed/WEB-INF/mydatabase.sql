SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
--
-- Dumping data for table `PERSON`
--

INSERT INTO `PERSON` (`ID`, `FIRST_NAME`, `LAST_NAME`, `MONEY`) VALUES
  (1, 'Sergey', 'Bondarenko', 10000),
  (2, 'Aleksandra', 'Turchinova', 20000),
  (3, 'Victoria', 'Osypchuk', 15000);

--
-- Dumping data for table `CREDIT_CARD`
--

INSERT INTO `CREDIT_CARD` (`ID`, `NUMBER`, `TYPE`, `person_ID`) VALUES
  (1, '5162 6060 9949 0150', 'MasterCard', 1),
  (2, '4916 6904 4775 9328', 'Visa', 2),
  (3, '5565 5022 2072 6872', 'MasterCard', 2),
  (4, '4485 6328 4051 8159', 'Visa', 3),
  (5, '5226 0970 9242 2313', 'MasterCard', 3),
  (6, '5130 8051 3184 9683', 'MasterCard', 3);
