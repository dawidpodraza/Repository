using System;
using _4_9_Projekt;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace _4_9_UnitTests
{
    [TestClass]
    public class PrzekazywanieParametr
    {
        [TestMethod]
        public void PrzekazywanieParametrowWaroscKlasa()
        {
            Karta karta1 = new Karta();
            karta1.Nazwa = "Marcin";

            UstawNazwe(karta1);

            Assert.AreEqual("Marcin", karta1.Nazwa);

        }

        [TestMethod]
        public void PrzekazywanieParametrowRefKlasa()
        {
            Karta karta1 = new Karta();
            karta1.Nazwa = "Marcin";

            UstawNazwe(ref karta1);

            Assert.AreEqual("Nowa Nazwa", karta1.Nazwa);

        }

        [TestMethod]
        public void PrzekazywanieParametrowWaroscInt()
        {
            int x1 = 10;
            ZwiekszWartosc(x1);

            Assert.AreEqual(10, x1);
        }

        [TestMethod]
        public void PrzekazywanieParametrowRefInt()
        {
            int x1 = 10;
            ZwiekszWartosc(ref x1);

            Assert.AreEqual(15, x1);
        }

        private void ZwiekszWartosc(ref int x1)
        {
            x1 = 15;
        }

        private void ZwiekszWartosc(int x1)
        {
            x1 = 15;
        }

        private void UstawNazwe(Karta karta)
        {
            karta = new Karta();
            karta.Nazwa = "Nowa Nazwa";
        }

        private void UstawNazwe(ref Karta karta)
        {
            karta = new Karta();
            karta.Nazwa = "Nowa Nazwa";
        }
    }
}
