using System;
using _4_9_Projekt;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace _4_9_UnitTests
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            bool wartosc = true;

            Assert.IsTrue(wartosc);
        }

        [TestMethod]
        public void TestMethod2()
        {
            int zmienna = 25;

            Assert.AreEqual(25, zmienna);
        }

        [TestMethod]
        public void ObliczanieSredniejWrtosci()
        {
            Karta karta1 = new Karta();
            karta1.DodajOcene(4);
            karta1.DodajOcene(6);
            karta1.DodajOcene(8);
            karta1.DodajOcene(4);
            karta1.DodajOcene(8);

            KartaStatystyki stat = karta1.ObliczStatystyki();

            Assert.AreEqual(6, stat.SredniaOcena);
        }

    }
}
